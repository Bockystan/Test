package bocky.cn.edu.bistu.ex2;

public interface DownloadListener{
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();

}
