# ComponentUpdateType

Type: enum | Package: com.hypixel.hytale.protocol

public enum ComponentUpdateType

Identifies the type of ECS component being updated in an EntityUpdate. Maps 1:1 to ComponentUpdate subtypes.

## Constants

- Nameplate | 0 | Entity display name and title.
- UIComponents | 1 | Entity UI overlay elements.
- CombatText | 2 | Floating combat/damage text.
- Model | 3 | Entity 3D model and appearance.
- PlayerSkin | 4 | Player skin/cosmetic data.
- Item | 5 | Entity-held item (e.g. dropped items).
- Block | 6 | Entity-associated block type (e.g. falling blocks).
- Equipment | 7 | Visible armor and held items.
- EntityStats | 8 | Health, mana, and custom stats.
- Transform | 9 | Position and rotation.
- MovementStates | 10 | Movement state flags (running, jumping, etc.).
- EntityEffects | 11 | Active buff/debuff effects.
- Interactions | 12 | Active interaction state.
- DynamicLight | 13 | Entity-emitted colored light.
- Interactable | 14 | Whether entity can be interacted with.
- Intangible | 15 | Whether entity is non-interactive.
- Invulnerable | 16 | Whether entity cannot take damage.
- RespondToHit | 17 | Hit response animation state.
- HitboxCollision | 18 | Collision hitbox configuration.
- Repulsion | 19 | Entity repulsion/push behavior.
- Prediction | 20 | Client-side prediction state.
- Audio | 21 | Entity sound event triggers.
- Mounted | 22 | Mount/vehicle state.
- NewSpawn | 23 | Initial spawn data for new entities.
- ActiveAnimations | 24 | Currently playing animations.
- Prop | 25 | Prop/decoration-specific data.

## Methods


public int getValue()

Returns the integer wire value for this `ComponentUpdateType` constant.


public static ComponentUpdateType fromValue(int value)

Returns the `ComponentUpdateType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`25`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ComponentUpdate
- EntityUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public int getValue()
  public static ComponentUpdateType fromValue(int value)

Fields:
public static final ComponentUpdateType[] VALUES
private final int value
