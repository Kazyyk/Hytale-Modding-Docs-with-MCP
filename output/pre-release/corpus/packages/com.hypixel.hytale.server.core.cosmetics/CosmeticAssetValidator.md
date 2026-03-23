# CosmeticAssetValidator

Type: class | Package: com.hypixel.hytale.server.core.cosmetics | Implements: Validator<String>

public class CosmeticAssetValidator implements Validator<String>

Validates cosmetic assets for consistency and completeness during loading.

## Key Methods

- public void accept(@Nullable String asset, @Nonnull ValidationResults results)
- public void updateSchema(SchemaContext context, @Nonnull Schema target)

Also in this package: BodyType, CosmeticRegistry, CosmeticType, CosmeticsModule, Emote, EmoteAsset, EmoteAssetPacketGenerator, HaircutType, HeadAccessoryType, InvalidSkinException, PlayerSkin, PlayerSkinGradient, PlayerSkinGradientSet, PlayerSkinPart, PlayerSkinPartId, PlayerSkinPartTexture, PlayerSkinPartType, PlayerSkinTintColor, Variant

Complete API:
  public void accept(String asset, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
private final CosmeticType type
