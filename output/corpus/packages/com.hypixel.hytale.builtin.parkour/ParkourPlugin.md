# ParkourPlugin

Type: class | Package: com.hypixel.hytale.builtin.parkour | Extends: JavaPlugin

public class ParkourPlugin extends JavaPlugin

Plugin class that registers components, systems, and commands for the parkour subsystem.

## Constants

- public static final String PARKOUR_CHECKPOINT_MODEL_ID

## Fields

- private ComponentType<EntityStore, ParkourCheckpoint> parkourCheckpointComponentType
- private Model parkourCheckpointModel
- private int lastIndex

## Methods

- public static ParkourPlugin get()
- super(init)
- public ComponentType<EntityStore, ParkourCheckpoint> getParkourCheckpointComponentType()
- public Model getParkourCheckpointModel()
- public Object2IntMap<UUID> getCurrentCheckpointByPlayerMap()
- public Object2LongMap<UUID> getStartTimeByPlayerMap()
- public Int2ObjectMap<UUID> getCheckpointUUIDMap()
- public int getLastIndex()
- @Override protected void setup()
- @Override protected void start()
- public void updateLastIndex(int index)
- public void updateLastIndex()
- public void resetPlayer(UUID playerUuid)
