# CommonAssetValidator

Type: class | Package: com.hypixel.hytale.server.core.asset.common | Implements: Validator<String>

public class CommonAssetValidator implements Validator<String>

Validates common asset references during asset loading. Checks that referenced assets exist in `CommonAssetRegistry`, have the required file extension, and reside within allowed root directories. Provides predefined validators for textures, models, animations, sounds, and icons.

## Predefined Validators

- TEXTURE_ITEM | png | Blocks, BlockTextures, Items, NPC, Resources, VFX
- TEXTURE_CHARACTER | png | Characters, NPC, Items, VFX
- MODEL_ITEM | blockymodel | Blocks, Items, Resources, NPC, VFX, Consumable
- MODEL_CHARACTER | blockymodel | Characters, NPC, Items, VFX
- ANIMATION_CHARACTER | blockyanim | Characters, NPC, Equipment, VFX, Items
- MUSIC | ogg | Music
- SOUNDS | ogg | Sounds

## Methods

- public void accept(@Nullable String asset, @Nonnull ValidationResults results)
- @Override public void updateSchema(SchemaContext context, @Nonnull Schema target)

Also in this package: AddCommonAssetResult, BlockyAnimation, BlockyAnimationCache, ChannelValidator, CommonAsset, CommonAssetModule, CommonAssetMonitorHandler, CommonAssetRegistry, HytaleFileTypes, OggVorbisInfo, OggVorbisInfoCache, PackAsset, PlayerCommonAssets, ResourceCommonAsset, SoundFileValidators

Complete API:
  public void accept(String asset, ValidationResults results)
  public void updateSchema(SchemaContext context, Schema target)

Fields:
public static final CommonAssetValidator TEXTURE_ITEM
public static final CommonAssetValidator TEXTURE_CHARACTER
public static final CommonAssetValidator TEXTURE_CHARACTER_ATTACHMENT
public static final CommonAssetValidator TEXTURE_TRAIL
public static final CommonAssetValidator TEXTURE_SKY
public static final CommonAssetValidator TEXTURE_PARTICLES
public static final CommonAssetValidator TEXTURE_ITEM_QUALITY
public static final CommonAssetValidator ICON_RESOURCE
public static final CommonAssetValidator ICON_ITEM
public static final CommonAssetValidator ICON_ITEM_CATEGORIES
public static final CommonAssetValidator ICON_CRAFTING
public static final CommonAssetValidator ICON_ENTITY_STAT
public static final CommonAssetValidator ICON_MODEL
public static final CommonAssetValidator ICON_EMOTE
public static final CommonAssetValidator UI_RETICLE_PART
public static final ArrayValidator<String> UI_RETICLE_PARTS_ARRAY
public static final CommonAssetValidator UI_SCREEN_EFFECT
public static final CommonAssetValidator UI_CRAFTING_DIAGRAM
public static final CommonAssetValidator MODEL_ITEM
public static final CommonAssetValidator MODEL_CHARACTER
public static final CommonAssetValidator MODEL_CHARACTER_ATTACHMENT
public static final CommonAssetValidator PREFAB_LIST
public static final CommonAssetValidator BLOCK_LIST
public static final CommonAssetValidator ANIMATION_ITEM_CHARACTER
public static final CommonAssetValidator ANIMATION_ITEM_BLOCK
public static final CommonAssetValidator ANIMATION_CHARACTER
public static final CommonAssetValidator ANIMATION_EMOTE
public static final CommonAssetValidator MUSIC
public static final CommonAssetValidator SOUNDS
private final String[] requiredRoots
private final String requiredExtension
private final boolean isUIAsset
