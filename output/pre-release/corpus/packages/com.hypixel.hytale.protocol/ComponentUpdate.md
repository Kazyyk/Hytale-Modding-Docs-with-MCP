# ComponentUpdate

Type: abstract class | Package: com.hypixel.hytale.protocol

public abstract class ComponentUpdate

Abstract polymorphic base class for ECS component updates sent in entity replication packets. Uses VarInt type-ID discriminated union with 26 concrete subtypes.

## Serialization Layout

- MAX_SIZE | 1,677,721,605

## Methods

Concrete subtypes are identified by a VarInt type ID prefix during deserialization.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdateType
- EntityUpdate
- ActiveAnimationsUpdate
- AudioUpdate
- BlockUpdate
- CombatTextUpdate
- DynamicLightUpdate
- EntityEffectsUpdate
- EntityStatsUpdate
- EquipmentUpdate
- HitboxCollisionUpdate
- IntangibleUpdate
- InteractableUpdate
- InteractionsUpdate
- InvulnerableUpdate
- ItemUpdate

Known subclasses: ActiveAnimationsUpdate, AudioUpdate, BlockUpdate, CombatTextUpdate, DynamicLightUpdate, EntityEffectsUpdate, EntityStatsUpdate, EquipmentUpdate, HitboxCollisionUpdate, IntangibleUpdate, InteractableUpdate, InteractionsUpdate, InvulnerableUpdate, ItemUpdate, ModelUpdate, MountedUpdate, MovementStatesUpdate, NameplateUpdate, NewSpawnUpdate, PlayerSkinUpdate, PredictionUpdate, PropUpdate, RepulsionUpdate, RespondToHitUpdate, TransformUpdate, UIComponentsUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ComponentUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int getTypeId()
  public abstract int serialize(ByteBuf var1)
  public abstract int computeSize()
  public int serializeWithTypeId(ByteBuf buf)
  public int computeSizeWithTypeId()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)

Fields:
public static final int MAX_SIZE
