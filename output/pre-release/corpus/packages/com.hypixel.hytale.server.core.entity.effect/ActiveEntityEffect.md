# ActiveEntityEffect

Type: class | Package: com.hypixel.hytale.server.core.entity.effect | Implements: Damage.Source

public class ActiveEntityEffect implements Damage.Source

## Fields

- private static final float DEFAULT_DURATION
- private static final Message MESSAGE_GENERAL_DAMAGE_CAUSES_UNKNOWN
- protected String entityEffectId
- protected int entityEffectIndex
- protected float initialDuration
- protected float remainingDuration
- protected boolean infinite
- protected boolean debuff
- protected String statusEffectIcon
- private float sinceLastDamage
- private boolean hasBeenDamaged
- protected boolean invulnerable
- private DamageCalculatorSystems.Sequence sequentialHits

## Methods

- public void tick( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, @Nonnull EntityStatMap entityStatMapComponent, float dt )
- private int calculateCyclesToRun(@Nonnull EntityEffect entityEffect, float dt)
- private static void tickStatChanges( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, @Nonnull EntityStatMap entityStatMapComponent, int cyclesToRun )
- private void tickDamage( @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Ref<EntityStore> ref, @Nonnull EntityEffect entityEffect, int cyclesToRun )
- public int getEntityEffectIndex()
- public float getInitialDuration()
- public float getRemainingDuration()
- public boolean isInfinite()
- public boolean isDebuff()
- public boolean isInvulnerable()
- @Override @Nonnull public Message getDeathMessage(@Nonnull Damage info, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Override @Nonnull public String toString()

Also in this package: EffectControllerComponent

Complete API:
  public void tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, EntityEffect entityEffect, EntityStatMap entityStatMapComponent, float dt)
  private int calculateCyclesToRun(EntityEffect entityEffect, float dt)
  private static void tickStatChanges(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, EntityEffect entityEffect, EntityStatMap entityStatMapComponent, int cyclesToRun)
  private void tickDamage(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, EntityEffect entityEffect, int cyclesToRun)
  public int getEntityEffectIndex()
  public float getInitialDuration()
  public float getRemainingDuration()
  public boolean isInfinite()
  public boolean isDebuff()
  public boolean isInvulnerable()
  public Message getDeathMessage(Damage info, Ref<EntityStore> targetRef, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()

Fields:
public static final BuilderCodec<ActiveEntityEffect> CODEC
private static final float DEFAULT_DURATION
private static final Message MESSAGE_GENERAL_DAMAGE_CAUSES_UNKNOWN
protected String entityEffectId
protected int entityEffectIndex
protected float initialDuration
protected float remainingDuration
protected boolean infinite
protected boolean debuff
protected String statusEffectIcon
private float sinceLastDamage
private boolean hasBeenDamaged
protected boolean invulnerable
private DamageCalculatorSystems.Sequence sequentialHits
