# CosmeticRegistry

Type: class | Package: com.hypixel.hytale.server.core.cosmetics

public class CosmeticRegistry

Registry that manages all cosmetic assets including skins, emotes, and body types.

## Constants

- String MODEL
- String SKIN_GRADIENTSET_ID

## Key Methods

- public Map<String, Emote> getEmotes()
- public Map<String, PlayerSkinTintColor> getEyeColors()
- public Map<String, PlayerSkinGradientSet> getGradientSets()
- public Map<String, PlayerSkinPart> getBodyCharacteristics()
- public Map<String, PlayerSkinPart> getUnderwear()
- public Map<String, PlayerSkinPart> getEyebrows()
- public Map<String, PlayerSkinPart> getEars()
- public Map<String, PlayerSkinPart> getEyes()
- public Map<String, PlayerSkinPart> getFaces()
- public Map<String, PlayerSkinPart> getMouths()
- public Map<String, PlayerSkinPart> getFacialHairs()
- public Map<String, PlayerSkinPart> getPants()
- public Map<String, PlayerSkinPart> getOverpants()
- public Map<String, PlayerSkinPart> getUndertops()
- public Map<String, PlayerSkinPart> getOvertops()
- public Map<String, PlayerSkinPart> getHaircuts()
- public Map<String, PlayerSkinPart> getShoes()
- public Map<String, PlayerSkinPart> getHeadAccessories()
- public Map<String, PlayerSkinPart> getFaceAccessories()
- public Map<String, PlayerSkinPart> getEarAccessories()
- public Map<String, PlayerSkinPart> getGloves()
- public Map<String, PlayerSkinPart> getSkinFeatures()
- public Map<String, PlayerSkinPart> getCapes()
- public Map<String, ?> getByType(@Nonnull CosmeticType type)

Also in this package: BodyType, CosmeticAssetValidator, CosmeticType, CosmeticsModule, Emote, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkin, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPart, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  private Map<String,T> load(Path assetsDirectory, String file, Function<BsonDocument,T> func)
  public Map<String,Emote> getEmotes()
  public Map<String,PlayerSkinTintColor> getEyeColors()
  public Map<String,PlayerSkinGradientSet> getGradientSets()
  public Map<String,PlayerSkinPart> getBodyCharacteristics()
  public Map<String,PlayerSkinPart> getUnderwear()
  public Map<String,PlayerSkinPart> getEyebrows()
  public Map<String,PlayerSkinPart> getEars()
  public Map<String,PlayerSkinPart> getEyes()
  public Map<String,PlayerSkinPart> getFaces()
  public Map<String,PlayerSkinPart> getMouths()
  public Map<String,PlayerSkinPart> getFacialHairs()
  public Map<String,PlayerSkinPart> getPants()
  public Map<String,PlayerSkinPart> getOverpants()
  public Map<String,PlayerSkinPart> getUndertops()
  public Map<String,PlayerSkinPart> getOvertops()
  public Map<String,PlayerSkinPart> getHaircuts()
  public Map<String,PlayerSkinPart> getShoes()
  public Map<String,PlayerSkinPart> getHeadAccessories()
  public Map<String,PlayerSkinPart> getFaceAccessories()
  public Map<String,PlayerSkinPart> getEarAccessories()
  public Map<String,PlayerSkinPart> getGloves()
  public Map<String,PlayerSkinPart> getSkinFeatures()
  public Map<String,PlayerSkinPart> getCapes()
  public Map<String,?> getByType(CosmeticType type)

Fields:
public static final String MODEL
public static final String SKIN_GRADIENTSET_ID
private final Map<String,Emote> emotes
private final Map<String,PlayerSkinTintColor> eyeColors
private final Map<String,PlayerSkinGradientSet> gradientSets
private final Map<String,PlayerSkinPart> bodyCharacteristics
private final Map<String,PlayerSkinPart> underwear
private final Map<String,PlayerSkinPart> eyebrows
private final Map<String,PlayerSkinPart> ears
private final Map<String,PlayerSkinPart> eyes
private final Map<String,PlayerSkinPart> faces
private final Map<String,PlayerSkinPart> mouths
private final Map<String,PlayerSkinPart> facialHair
private final Map<String,PlayerSkinPart> pants
private final Map<String,PlayerSkinPart> overpants
private final Map<String,PlayerSkinPart> undertops
private final Map<String,PlayerSkinPart> overtops
private final Map<String,PlayerSkinPart> haircuts
private final Map<String,PlayerSkinPart> shoes
private final Map<String,PlayerSkinPart> headAccessory
private final Map<String,PlayerSkinPart> faceAccessory
private final Map<String,PlayerSkinPart> earAccessory
private final Map<String,PlayerSkinPart> gloves
private final Map<String,PlayerSkinPart> capes
private final Map<String,PlayerSkinPart> skinFeatures
