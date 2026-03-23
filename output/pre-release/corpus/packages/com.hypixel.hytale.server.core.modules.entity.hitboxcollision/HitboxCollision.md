# HitboxCollision

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.hitboxcollision | Implements: Component

public class HitboxCollision implements Component<EntityStore>

## Fields

- private int hitboxCollisionConfigIndex
- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, HitboxCollision> getComponentType()
- public HitboxCollision(@Nonnull HitboxCollisionConfig hitboxCollisionConfig)
- protected HitboxCollision()
- public int getHitboxCollisionConfigIndex()
- public void setHitboxCollisionConfigIndex(int hitboxCollisionConfigIndex)
- public boolean consumeNetworkOutdated()
- public Component<EntityStore> clone()
