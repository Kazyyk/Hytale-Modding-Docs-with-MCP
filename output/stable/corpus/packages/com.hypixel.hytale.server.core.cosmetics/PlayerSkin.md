# PlayerSkin

Type: class | Package: com.hypixel.hytale.server.core.cosmetics

public class PlayerSkin

Represents a full player skin cosmetic composed of multiple skin parts.

## Key Methods

- public PlayerSkin.PlayerSkinPartId getBodyCharacteristic()
- public PlayerSkin.PlayerSkinPartId getUnderwear()
- public String getFace()
- public PlayerSkin.PlayerSkinPartId getEyes()
- public String getEars()
- public String getMouth()
- public PlayerSkin.PlayerSkinPartId getFacialHair()
- public PlayerSkin.PlayerSkinPartId getHaircut()
- public PlayerSkin.PlayerSkinPartId getEyebrows()
- public PlayerSkin.PlayerSkinPartId getPants()
- public PlayerSkin.PlayerSkinPartId getOverpants()
- public PlayerSkin.PlayerSkinPartId getUndertop()
- public PlayerSkin.PlayerSkinPartId getOvertop()
- public PlayerSkin.PlayerSkinPartId getShoes()
- public PlayerSkin.PlayerSkinPartId getHeadAccessory()
- public PlayerSkin.PlayerSkinPartId getFaceAccessory()
- public PlayerSkin.PlayerSkinPartId getEarAccessory()
- public PlayerSkin.PlayerSkinPartId getSkinFeature()
- public PlayerSkin.PlayerSkinPartId getGloves()
- public PlayerSkin.PlayerSkinPartId getCape()
- public static PlayerSkin.PlayerSkinPartId fromString(@Nonnull String stringId)
- public String getAssetId()
- public String getTextureId()
- public String getVariantId()
- public String toString()

Also in this package: BodyType, CosmeticAssetValidator, CosmeticRegistry, CosmeticType, CosmeticsModule, Emote, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPart, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  private static PlayerSkin.PlayerSkinPartId getId(BsonDocument doc, String key)
  public PlayerSkin.PlayerSkinPartId getBodyCharacteristic()
  public PlayerSkin.PlayerSkinPartId getUnderwear()
  public String getFace()
  public PlayerSkin.PlayerSkinPartId getEyes()
  public String getEars()
  public String getMouth()
  public PlayerSkin.PlayerSkinPartId getFacialHair()
  public PlayerSkin.PlayerSkinPartId getHaircut()
  public PlayerSkin.PlayerSkinPartId getEyebrows()
  public PlayerSkin.PlayerSkinPartId getPants()
  public PlayerSkin.PlayerSkinPartId getOverpants()
  public PlayerSkin.PlayerSkinPartId getUndertop()
  public PlayerSkin.PlayerSkinPartId getOvertop()
  public PlayerSkin.PlayerSkinPartId getShoes()
  public PlayerSkin.PlayerSkinPartId getHeadAccessory()
  public PlayerSkin.PlayerSkinPartId getFaceAccessory()
  public PlayerSkin.PlayerSkinPartId getEarAccessory()
  public PlayerSkin.PlayerSkinPartId getSkinFeature()
  public PlayerSkin.PlayerSkinPartId getGloves()
  public PlayerSkin.PlayerSkinPartId getCape()

Fields:
private final PlayerSkin.PlayerSkinPartId bodyCharacteristic
private final PlayerSkin.PlayerSkinPartId underwear
private final String face
private final String ears
private final String mouth
private final PlayerSkin.PlayerSkinPartId eyes
private final PlayerSkin.PlayerSkinPartId facialHair
private final PlayerSkin.PlayerSkinPartId haircut
private final PlayerSkin.PlayerSkinPartId eyebrows
private final PlayerSkin.PlayerSkinPartId pants
private final PlayerSkin.PlayerSkinPartId overpants
private final PlayerSkin.PlayerSkinPartId undertop
private final PlayerSkin.PlayerSkinPartId overtop
private final PlayerSkin.PlayerSkinPartId shoes
private final PlayerSkin.PlayerSkinPartId headAccessory
private final PlayerSkin.PlayerSkinPartId faceAccessory
private final PlayerSkin.PlayerSkinPartId earAccessory
private final PlayerSkin.PlayerSkinPartId skinFeature
private final PlayerSkin.PlayerSkinPartId gloves
private final PlayerSkin.PlayerSkinPartId cape
