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
