# SpawnJob

Type: class | Package: com.hypixel.hytale.server.spawning.jobs

public abstract class SpawnJob

## Fields

- protected static final HytaleLogger LOGGER
- private static int jobIdCounter
- protected final int jobId
- protected final SpawningContext spawningContext
- protected int columnBudget
- protected int budgetUsed
- protected boolean terminated

## Methods

- public int getJobId()
- public int getBudgetUsed()
- public void setBudgetUsed(int budgetUsed)
- public int getColumnBudget()
- public void setColumnBudget(int columnBudget)
- @Nonnull public SpawningContext getSpawningContext()
- protected void beginProbing()
- public void reset()
- public boolean budgetAvailable()
- public boolean isTerminated()
- public void setTerminated(boolean terminated)
- @Nullable public abstract ISpawnableWithModel getSpawnable()
- public abstract boolean shouldTerminate()
- @Nullable public abstract String getSpawnableName()

Known subclasses: NPCBeaconSpawnJob

Also in this package: NPCBeaconSpawnJob

Complete API:
  public int getJobId()
  public int getBudgetUsed()
  public void setBudgetUsed(int budgetUsed)
  public int getColumnBudget()
  public void setColumnBudget(int columnBudget)
  public SpawningContext getSpawningContext()
  protected void beginProbing()
  public void reset()
  public boolean budgetAvailable()
  public boolean isTerminated()
  public void setTerminated(boolean terminated)
  public abstract ISpawnableWithModel getSpawnable()
  public abstract boolean shouldTerminate()
  public abstract String getSpawnableName()

Fields:
protected static final HytaleLogger LOGGER
private static int jobIdCounter
protected final int jobId
protected final SpawningContext spawningContext
protected int columnBudget
protected int budgetUsed
protected boolean terminated
