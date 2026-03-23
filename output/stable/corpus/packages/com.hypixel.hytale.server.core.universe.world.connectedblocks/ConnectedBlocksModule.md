# ConnectedBlocksModule

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks | Extends: JavaPlugin

public class ConnectedBlocksModule extends JavaPlugin

Module responsible for registering and managing connected block pattern evaluation.

## Constants

- PluginManifest MANIFEST

## Key Methods

- public static ConnectedBlocksModule get()
- protected void setup()

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public static ConnectedBlocksModule get()
  protected void setup()
  private static void onBlockTypesChanged(LoadedAssetsEvent<String,BlockType,BlockTypeAssetMap<String,BlockType>> event)

Fields:
public static final PluginManifest MANIFEST
private static ConnectedBlocksModule instance
