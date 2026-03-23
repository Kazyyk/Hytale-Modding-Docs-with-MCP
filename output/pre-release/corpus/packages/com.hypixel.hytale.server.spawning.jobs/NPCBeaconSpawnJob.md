# NPCBeaconSpawnJob

Type: class | Package: com.hypixel.hytale.server.spawning.jobs | Extends: SpawnJob

public class NPCBeaconSpawnJob extends SpawnJob

## Fields

- protected int roleIndex
- private Ref<EntityStore> player
- private int spawnsThisRound
- private int flockSize
- private FlockAsset flockAsset

## Methods

- public int getRoleIndex()
- @Nullable public Ref<EntityStore> getPlayer()
- public int getSpawnsThisRound()
- public int getFlockSize()
- @Nullable public FlockAsset getFlockAsset()
- @Override public boolean shouldTerminate()
- @Override public boolean budgetAvailable()
- @Override public void reset()
- @Nullable @Override public ISpawnableWithModel getSpawnable()
- @Nullable @Override public String getSpawnableName()
- public void beginProbing(PlayerRef targetPlayer, int spawnsThisRound, int roleIndex, FlockAsset flockDefinition)

Also in this package: SpawnJob

Complete API:
  public int getRoleIndex()
  public Ref<EntityStore> getPlayer()
  public int getSpawnsThisRound()
  public int getFlockSize()
  public FlockAsset getFlockAsset()
  public boolean shouldTerminate()
  public boolean budgetAvailable()
  public void reset()
  public ISpawnableWithModel getSpawnable()
  public String getSpawnableName()
  public void beginProbing(PlayerRef targetPlayer, int spawnsThisRound, int roleIndex, FlockAsset flockDefinition)

Fields:
protected int roleIndex
private Ref<EntityStore> player
private int spawnsThisRound
private int flockSize
private FlockAsset flockAsset
