# SnapshotBuffer

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class SnapshotBuffer implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private EntitySnapshot[] snapshots
- private int currentTickIndex
- private int oldestTickIndex
- private int currentIndex

## Methods

- public static ComponentType<EntityStore, SnapshotBuffer> getComponentType()
- @Nonnull public EntitySnapshot getSnapshotClamped(int tickIndex)
- throw new IllegalStateException("Snapshots not initialized")
- throw new IllegalArgumentException("Tick index is in the future")
- @Nullable public EntitySnapshot getSnapshot(int tickIndex)
- private EntitySnapshot getSnapshotRelative(int relIndex)
- public void storeSnapshot(int tickIndex, @Nonnull Vector3d position, @Nonnull Vector3f bodyRotation)
- public void resize(int newLength)
- throw new IllegalArgumentException("New size is too small: " + newLength)
- public boolean isInitialized()
- public int getCurrentTickIndex()
- public int getOldestTickIndex()
- @Override public Component<EntityStore> clone()
