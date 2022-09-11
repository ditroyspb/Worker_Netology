public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {

        for (int i = 0; i < 33; i++) {
            errorCallback.onError("Task " + i + " is failed - Error.");
        }
        for (int i = 33; i < 100; i++) {
            callback.onDone("Task " + i + " is done.");
        }
    }
}