// Rule 18. Concurrency (CON)
// CON51-J Do not assume that the sleep(), yield(), or getState() methods provide synchronization semantics

final class ControlledStop implements Runnable {

    @Override public void run() {
        // Record current thread, so others can interrupt it
        myThread = currentThread();
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000);
            }   catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
        }
    }

    public void shutdown(Thread th) {
        th.interrupt();
    }
}
