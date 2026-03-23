# SpawnReference

Type: class | Package: com.hypixel.hytale.server.npc.components | Implements: Component

public abstract class SpawnReference implements Component

## Fields

- protected static final BuilderCodec<SpawnReference> BASE_CODEC
- public static final float MARKER_LOST_TIMEOUT
- protected InvalidatablePersistentRef reference
- private float markerLostTimeoutCounter

## Methods

- public InvalidatablePersistentRef getReference()
- public boolean tickMarkerLostTimeoutCounter(float dt)
- public void refreshTimeoutCounter()
- @Override public abstract Component<EntityStore> clone()

Known subclasses: SpawnBeaconReference, SpawnMarkerReference

Also in this package: FailedSpawnComponent, SortBufferProviderResource, SpawnBeaconReference, SpawnMarkerReference, StepComponent, Timers

Complete API:
  public InvalidatablePersistentRef getReference()
  public boolean tickMarkerLostTimeoutCounter(float dt)
  public void refreshTimeoutCounter()
  public abstract Component<EntityStore> clone()

Fields:
protected static final BuilderCodec<SpawnReference> BASE_CODEC
public static final float MARKER_LOST_TIMEOUT
protected InvalidatablePersistentRef reference
private float markerLostTimeoutCounter
