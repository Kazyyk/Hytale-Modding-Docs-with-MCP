# PlayerSkinPart

Type: class | Package: com.hypixel.hytale.server.core.cosmetics

public class PlayerSkinPart

Represents a single part of a player skin (e.g., torso, limb).

## Enum Constants

- `Short`
- `Medium`
- `Long`

## Key Methods

- public String getId()
- public String getName()
- public String getModel()
- public Map<String, PlayerSkinPartTexture> getTextures()
- public Map<String, PlayerSkinPart.Variant> getVariants()
- public boolean isDefaultAsset()
- public String[] getTags()
- public PlayerSkinPart.HaircutType getHairType()
- public boolean doesRequireGenericHaircut()
- public PlayerSkinPart.HeadAccessoryType getHeadAccessoryType()
- public String getGreyscaleTexture()
- public String getGradientSet()
- public String toString()

Also in this package: BodyType, CosmeticAssetValidator, CosmeticRegistry, CosmeticType, CosmeticsModule, Emote, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkin, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  public String getId()
  public String getName()
  public String getModel()
  public Map<String,PlayerSkinPartTexture> getTextures()
  public Map<String,PlayerSkinPart.Variant> getVariants()
  public boolean isDefaultAsset()
  public String[] getTags()
  public PlayerSkinPart.HaircutType getHairType()
  public boolean doesRequireGenericHaircut()
  public PlayerSkinPart.HeadAccessoryType getHeadAccessoryType()
  public String getGreyscaleTexture()
  public String getGradientSet()
  public String toString()

Fields:
private final String id
private final String name
private String model
private String greyscaleTexture
private String gradientSet
private Map<String,PlayerSkinPartTexture> textures
private Map<String,PlayerSkinPart.Variant> variants
private boolean isDefaultAsset
private String[] tags
private PlayerSkinPart.HaircutType hairType
private boolean requiresGenericHaircut
private PlayerSkinPart.HeadAccessoryType headAccessoryType
