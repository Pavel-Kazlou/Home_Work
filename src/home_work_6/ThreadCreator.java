package home_work_6;

import java.util.concurrent.*;

public class ThreadCreator {

    private final ExecutorService service;

    /**
     * метод создаёт пул потоков
     */
    public ThreadCreator() {
        this.service = Executors.newFixedThreadPool(5);
    }

    public Long execute(Callable<Long> thread) {
        Future<Long> future = service.submit(thread);
        Long result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка во время выполнения потока");
        }
        return result;
    }
}
