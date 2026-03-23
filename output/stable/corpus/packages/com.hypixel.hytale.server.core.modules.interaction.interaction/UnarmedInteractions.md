# UnarmedInteractions

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction | Implements: J, s, o, n, A, s, s, e, t, W, i, t, h, M, a, p, <, S, t, r, i, n, g, ,,  , D, e, f, a, u, l, t, A, s, s, e, t, M, a, p, <, S, t, r, i, n, g, ,,  , U, n, a, r, m, e, d, I, n, t, e, r, a, c, t, i, o, n, s, >, >

public class UnarmedInteractions implements JsonAssetWithMap<String, DefaultAssetMap<String, UnarmedInteractions>>

JSON asset defining unarmed (empty-hand) interactions mapped by `InteractionType`. Loaded from asset files with a default ID of `"Empty"`. Automatically includes a `SwapFrom` interaction (`ChangeActiveSlotInteraction.DEFAULT_ROOT`) if not specified.

## Key Methods

- getAssetMap() | DefaultAssetMap<String, UnarmedInteractions> | Returns the global asset map for unarmed interactions
- getId() | String | Returns the asset ID
- getInteractions() | Map<InteractionType, String> | Returns the interaction type to root interaction ID mapping

## Fields

- id | String | Asset identifier
- interactions | Map<InteractionType, String> | Mapping from interaction type to root interaction ID
- data | AssetExtraInfo.Data | Asset metadata

Also in this package: Cooldown, CooldownHandler, InteractionPacketGenerator, RootInteractionPacketGenerator, UnarmedInteractionsPacketGenerator

Complete API:
  public static DefaultAssetMap<String,UnarmedInteractions> getAssetMap()
  public String getId()
  public Map<InteractionType,String> getInteractions()
  public String toString()

Fields:
public static final String DEFAULT_UNARMED_ID
public static final AssetBuilderCodec<String,UnarmedInteractions> CODEC
private static DefaultAssetMap<String,UnarmedInteractions> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected Map<InteractionType,String> interactions
