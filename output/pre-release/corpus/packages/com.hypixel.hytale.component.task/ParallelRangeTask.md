# ParallelRangeTask

Type: class | Package: com.hypixel.hytale.component.task | Extends: CountedCompleter

public class ParallelRangeTask<D> extends CountedCompleter

## Fields

- public static final int PARALLELISM
- public static final int TASK_COUNT
- private final ParallelRangeTask.SubTask<D>[] subTasks
- private int size
- public volatile boolean running

## Methods

- @Override public void reinitialize()
- @Nonnull public ParallelRangeTask<D> init(int from, int to)
- public int size()
- public D get(int i)
- public void set(int i, D data)
- @Override public void compute()

## Inner Types

- `ParallelRangeTask.SubTask`

Also in this package: ParallelTask, SubTask

Complete API:
  public void reinitialize()
  public ParallelRangeTask<D> init(int from, int to)
  public int size()
  public D get(int i)
  public void set(int i, D data)
  public void compute()

Fields:
public static final int PARALLELISM
public static final int TASK_COUNT
private final ParallelRangeTask.SubTask<D>[] subTasks
private int size
public volatile boolean running
