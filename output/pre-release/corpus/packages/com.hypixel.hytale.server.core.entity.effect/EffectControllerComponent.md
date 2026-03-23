# EffectControllerComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.effect | Implements: Component<EntityStore>

public class EffectControllerComponent implements Component<EntityStore>

## Fields

- protected final Int2ObjectMap<ActiveEntityEffect> activeEffects
- protected int[] cachedActiveEffectIndexes
- protected ObjectList<EntityEffectUpdate> changes
- protected boolean isNetworkOutdated
- protected Model originalModel
- protected int activeModelChangeEntityEffectIndex
- protected boolean isInvulnerable

## Methods

- @Nonnull public static ComponentType<EntityStore, EffectControllerComponent> getComponentType()
- public boolean isInvulnerable()
- public void setInvulnerable(boolean invulnerable)
- public boolean addEffect(@Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean addEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public boolean addEffect( @Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, float duration, @Nonnull OverlapBehavior overlapBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public boolean addEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, float duration, @Nonnull OverlapBehavior overlapBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public boolean addInfiniteEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull EntityEffect entityEffect, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public void setModelChange( @Nonnull Ref<EntityStore> ownerRef, @Nonnull EntityEffect entityEffect, int entityEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- public void tryResetModelChange(@Nonnull Ref<EntityStore> ownerRef, int activeEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void addActiveEntityEffects(@Nonnull ActiveEntityEffect[] activeEntityEffects)
- public void removeEffect(@Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void removeEffect( @Nonnull Ref<EntityStore> ownerRef, int entityEffectIndex, @Nonnull RemovalBehavior removalBehavior, @Nonnull ComponentAccessor<EntityStore> componentAccessor )
- private void addChange(@Nonnull EntityEffectUpdate update)
- public void clearEffects(@Nonnull Ref<EntityStore> ownerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void invalidateCache()
- @Nonnull public Int2ObjectMap<ActiveEntityEffect> getActiveEffects()
- public int[] getActiveEffectIndexes()
- public boolean consumeNetworkOutdated()
- @Nonnull public EntityEffectUpdate[] consumeChanges()
- public void clearChanges()
- @Nonnull public EntityEffectUpdate[] createInitUpdates()
- @Nullable public ActiveEntityEffect[] getAllActiveEntityEffects()
- @Override @Nonnull public String toString()
- @Nonnull public EffectControllerComponent clone()
