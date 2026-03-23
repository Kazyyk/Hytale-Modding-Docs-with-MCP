# CosmeticsModule

Type: class | Package: com.hypixel.hytale.server.core.cosmetics | Extends: JavaPlugin

public class CosmeticsModule extends JavaPlugin

Module that initializes and manages the cosmetics subsystem.

## Constants

- PluginManifest MANIFEST

## Key Methods

- protected void setup()
- public CosmeticRegistry getRegistry()
- public Model createRandomModel(@Nonnull Random random)
- public Model createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)
- public Model createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin, float scale)
- public void validateSkin(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)
- public static CosmeticsModule get()
- public com.hypixel.hytale.protocol.PlayerSkin generateRandomSkin(@Nonnull Random random)
- public String getPartType()
- public String getPartId()

Also in this package: BodyType, CosmeticAssetValidator, CosmeticRegistry, CosmeticType, Emote, EmoteAsset, EmoteAssetPacketGenerator, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkin, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPart, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  protected void setup()
  public CosmeticRegistry getRegistry()
  private void validateGeneratedSkin(LoadAssetEvent eventType)
  public Model createRandomModel(Random random)
  public Model createModel(com.hypixel.hytale.protocol.PlayerSkin skin)
  public Model createModel(com.hypixel.hytale.protocol.PlayerSkin skin, float scale)
  public void validateSkin(com.hypixel.hytale.protocol.PlayerSkin skin)
  private boolean isValidAttachment(Map<String,PlayerSkinPart> map, String id)
  private boolean isValidTexture(PlayerSkinPart part, String variantId, String textureId)
  private boolean isValidAttachment(Map<String,PlayerSkinPart> map, String id, boolean required)
  private boolean isValidHaircutAttachment(String haircutId, String headAccessoryId)
  public static CosmeticsModule get()
  public com.hypixel.hytale.protocol.PlayerSkin generateRandomSkin(Random random)
  private String randomSkinPart(Map<String,PlayerSkinPart> map, Random random)
  private String randomSkinPart(Map<String,PlayerSkinPart> map, boolean required, Random random)
  private String randomSkinPart(Map<String,PlayerSkinPart> map, boolean required, boolean color, Random random)

Fields:
public static final PluginManifest MANIFEST
private static CosmeticsModule INSTANCE
private CosmeticRegistry registry
