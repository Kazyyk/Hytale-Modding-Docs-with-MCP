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

Also in this package: ActiveEntityEffect

Complete API:
  public static ComponentType<EntityStore,EffectControllerComponent> getComponentType()
  public boolean isInvulnerable()
  public void setInvulnerable(boolean invulnerable)
  public boolean addEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)
  public boolean addEffect(Ref<EntityStore> ownerRef, int entityEffectIndex, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)
  public boolean addEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, float duration, OverlapBehavior overlapBehavior, ComponentAccessor<EntityStore> componentAccessor)
  public boolean addEffect(Ref<EntityStore> ownerRef, int entityEffectIndex, EntityEffect entityEffect, float duration, OverlapBehavior overlapBehavior, ComponentAccessor<EntityStore> componentAccessor)
  public boolean addInfiniteEffect(Ref<EntityStore> ownerRef, int entityEffectIndex, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)
  public void setModelChange(Ref<EntityStore> ownerRef, EntityEffect entityEffect, int entityEffectIndex, ComponentAccessor<EntityStore> componentAccessor)
  public void tryResetModelChange(Ref<EntityStore> ownerRef, int activeEffectIndex, ComponentAccessor<EntityStore> componentAccessor)
  public void addActiveEntityEffects(ActiveEntityEffect[] activeEntityEffects)
  public void removeEffect(Ref<EntityStore> ownerRef, int entityEffectIndex, ComponentAccessor<EntityStore> componentAccessor)
  public void removeEffect(Ref<EntityStore> ownerRef, int entityEffectIndex, RemovalBehavior removalBehavior, ComponentAccessor<EntityStore> componentAccessor)
  private void addChange(EntityEffectUpdate update)
  public void clearEffects(Ref<EntityStore> ownerRef, ComponentAccessor<EntityStore> componentAccessor)
  public void invalidateCache()
  public Int2ObjectMap<ActiveEntityEffect> getActiveEffects()
  public int[] getActiveEffectIndexes()
  public boolean consumeNetworkOutdated()
  public EntityEffectUpdate[] consumeChanges()
  public void clearChanges()
  public EntityEffectUpdate[] createInitUpdates()
  public ActiveEntityEffect[] getAllActiveEntityEffects()
  public String toString()
  public EffectControllerComponent clone()

Fields:
public static final BuilderCodec<EffectControllerComponent> CODEC
protected final Int2ObjectMap<ActiveEntityEffect> activeEffects
protected int[] cachedActiveEffectIndexes
protected ObjectList<EntityEffectUpdate> changes
protected boolean isNetworkOutdated
protected Model originalModel
protected int activeModelChangeEntityEffectIndex
protected boolean isInvulnerable
