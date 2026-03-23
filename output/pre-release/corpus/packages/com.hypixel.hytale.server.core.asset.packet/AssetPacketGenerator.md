# AssetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.packet

public abstract class AssetPacketGenerator<K, T, M>

## Methods

- public abstract ToClientPacket generateInitPacket(M var1, Map<K,T> var2)
- public abstract ToClientPacket generateUpdatePacket(M var1, Map<K,T> var2, AssetUpdateQuery var3)
- @Nullable public abstract ToClientPacket generateRemovePacket(M var1, Set<K> var2, AssetUpdateQuery var3)

Known subclasses: BlockSetPacketGenerator, BlockTypePacketGenerator, CraftingRecipePacketGenerator, EmoteAssetPacketGenerator, EntityUIComponentPacketGenerator, EnvironmentPacketGenerator, FluidTypePacketGenerator, HitboxCollisionConfigPacketGenerator, InteractionPacketGenerator, ItemPacketGenerator, RecipePacketGenerator, RepulsionConfigPacketGenerator, RootInteractionPacketGenerator, SimpleAssetPacketGenerator

Also in this package: DefaultAssetPacketGenerator, SimpleAssetPacketGenerator

Complete API:
  public abstract ToClientPacket generateInitPacket(M var1, Map<K,T> var2)
  public abstract ToClientPacket generateUpdatePacket(M var1, Map<K,T> var2, AssetUpdateQuery var3)
  public abstract ToClientPacket generateRemovePacket(M var1, Set<K> var2, AssetUpdateQuery var3)
