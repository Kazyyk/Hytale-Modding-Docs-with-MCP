# LocalSpawnController

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: Component<EntityStore>

public class LocalSpawnController implements Component<EntityStore>

Component attached to player entities that tracks the countdown to the next local spawn controller run. Ticks down a timer and signals when a spawn check should occur.

## Methods

- public static ComponentType<EntityStore, LocalSpawnController> getComponentType()
- public void setTimeToNextRunSeconds(double seconds)
- public boolean tickTimeToNextRunSeconds(float dt)

Also in this package: LocalSpawnBeacon, LocalSpawnBeaconSystem, LocalSpawnControllerSystem, LocalSpawnForceTriggerSystem, LocalSpawnSetupSystem, LocalSpawnState

Complete API:
  public static ComponentType<EntityStore,LocalSpawnController> getComponentType()
  public void setTimeToNextRunSeconds(double seconds)
  public boolean tickTimeToNextRunSeconds(float dt)
  public Component<EntityStore> clone()
  public String toString()

Fields:
private double timeToNextRunSeconds
