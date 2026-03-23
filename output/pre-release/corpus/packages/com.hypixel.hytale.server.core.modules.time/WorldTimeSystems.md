# WorldTimeSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.time

public class WorldTimeSystems

Container for world time initialization and ticking systems.

## Inner Types

### Init


public static class WorldTimeSystems.Init extends StoreSystem<EntityStore>

Initializes `WorldTimeResource` from world config on system add; saves time back on remove.

### Ticking


public static class WorldTimeSystems.Ticking extends TickingSystem<EntityStore>

Advances world time each tick.
