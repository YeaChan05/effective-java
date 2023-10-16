package org.yeachan.chapter2.item8;

import java.lang.ref.Cleaner;

/**
 * package :  org.yeachan.chapter2.item8
 * fileName : SampleResource
 * author :  ShinYeaChan
 * date : 2023-10-16
 */
public class SampleResource implements AutoCloseable{
    private boolean closed;
    
    private static final Cleaner CLEANER    =Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final ResourceCleaner resourceCleaner;
    
    public SampleResource() {
        this.resourceCleaner = new ResourceCleaner();
        this.cleanable = CLEANER.register(this,resourceCleaner);
    }
    
    private static class ResourceCleaner implements Runnable{
        
        @Override
        public void run() {
            System.out.println("Clean");
        }
    }
    @Override
    public void close() throws RuntimeException {
        if (this.closed){
            throw new IllegalStateException();
        }
        closed=true;
        cleanable.clean();
    }
    
    public void hello() {
        System.out.println("hello");
    }
    
    @Override
    protected void finalize() throws Throwable {
        if(!this.closed)
            close();
    }
}
