# ParallelTask

Type: class | Package: com.hypixel.hytale.component.task | Extends: CountedCompleter

public class ParallelTask<D> extends CountedCompleter

## Fields

- private final Supplier<D> supplier
- private ParallelRangeTask<D>[] subTasks
- private int size
- private volatile boolean running

## Methods

- @Override public void reinitialize()
- public void init()
- public ParallelRangeTask<D> appendTask()
- public int size()
- public ParallelRangeTask<D> get(int i)
- @Override public void compute()
- public void doInvoke()
