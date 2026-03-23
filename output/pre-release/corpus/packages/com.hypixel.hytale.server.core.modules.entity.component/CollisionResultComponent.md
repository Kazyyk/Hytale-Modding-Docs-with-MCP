# CollisionResultComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class CollisionResultComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private boolean pendingCollisionCheck

## Methods

- public static ComponentType<EntityStore, CollisionResultComponent> getComponentType()
- public CollisionResult getCollisionResult()
- public Vector3d getCollisionStartPosition()
- public Vector3d getCollisionPositionOffset()
- public Vector3d getCollisionStartPositionCopy()
- public Vector3d getCollisionPositionOffsetCopy()
- public boolean isPendingCollisionCheck()
- public void markPendingCollisionCheck()
- public void consumePendingCollisionCheck()
- public void resetLocationChange()
- @Override public Component<EntityStore> clone()
