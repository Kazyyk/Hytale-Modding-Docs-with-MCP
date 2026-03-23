# LocalSpawnController

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: Component<EntityStore>

public class LocalSpawnController implements Component<EntityStore>

Component attached to player entities that tracks the countdown to the next local spawn controller run. Ticks down a timer and signals when a spawn check should occur.

## Methods

- public static ComponentType<EntityStore, LocalSpawnController> getComponentType()
- public void setTimeToNextRunSeconds(double seconds)
- public boolean tickTimeToNextRunSeconds(float dt)
