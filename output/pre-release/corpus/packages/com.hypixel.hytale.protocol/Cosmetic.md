# Cosmetic

Type: enum | Package: com.hypixel.hytale.protocol

public enum Cosmetic

Identifies cosmetic equipment slots for character customization.

## Constants

- Haircut | 0 | Hair style.
- FacialHair | 1 | Beard, mustache, or other facial hair.
- Undertop | 2 | Inner torso layer (shirt, undershirt).
- Overtop | 3 | Outer torso layer (jacket, vest).
- Pants | 4 | Lower body inner layer.
- Overpants | 5 | Lower body outer layer (skirt, chaps).
- Shoes | 6 | Footwear.
- Gloves | 7 | Hand coverings.
- Cape | 8 | Back-attached cape or cloak.
- HeadAccessory | 9 | Head decoration (hat, crown, horns).
- FaceAccessory | 10 | Face decoration (glasses, mask).
- EarAccessory | 11 | Ear decoration (earrings).
- Ear | 12 | Ear shape/style.

## Methods


public int getValue()

Returns the integer wire value for this `Cosmetic` constant.


public static Cosmetic fromValue(int value)

Returns the `Cosmetic` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`12`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ItemArmor

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public int getValue()
  public static Cosmetic fromValue(int value)

Fields:
public static final Cosmetic[] VALUES
private final int value
