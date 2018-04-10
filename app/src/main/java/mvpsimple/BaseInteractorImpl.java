package mvpsimple;

/**
 * Created by rinfon on 2018/4/9.
 */

public class BaseInteractorImpl implements BaseInteractor {

    private IBaseRepository mMessageRepository;

    public BaseInteractorImpl(IBaseRepository messageRepository) {
        mMessageRepository = messageRepository;
    }

    @Override
    public void execute() {
        try {
            mMessageRepository.Action();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void cancel() {
        try {
            mMessageRepository.Cancel();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
