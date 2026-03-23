# AssetIconProperties

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.AssetIconProperties>

public class AssetIconProperties implements NetworkSerializable<com.hypixel.hytale.protocol.AssetIconProperties>

Icon display configuration for assets. Defines scale, 2D translation offset, and 3D rotation for rendering item/block icons in the UI. Serialized via `BuilderCodec` with Scale (double), Translation (Vector2d), and Rotation (Vector3d) fields.

Also in this package: BlockGroup, BlockSelectorToolData, BuilderToolItemReferenceAsset, CraftingRecipe, DurabilityLossBlockTypes, FieldcraftCategory, InteractionModifierId, Item, ItemAppearanceCondition, ItemArmor, ItemCategory, ItemDrop, ItemDropList, ItemEntityConfig, ItemGlider, ItemHudUI, ItemPullbackConfig, ItemQuality, ItemReticle, ItemReticleConfig (and 10 more)

Complete API:
  public float getScale()
  public Vector2f getTranslation()
  public Vector3f getRotation()
  public com.hypixel.hytale.protocol.AssetIconProperties toPacket()
  public String toString()

Fields:
public static final BuilderCodec<AssetIconProperties> CODEC
private float scale
private Vector2f translation
private Vector3f rotation
