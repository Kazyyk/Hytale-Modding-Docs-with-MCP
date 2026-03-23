# CustomTemplateConnectedBlockPattern

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public abstract class CustomTemplateConnectedBlockPattern

Connected block pattern that references a CustomConnectedBlockTemplateAsset for rule evaluation.

## Constants

- CodecMapCodec<CustomTemplateConnectedBlockPattern> CODEC

## Key Methods

- public abstract Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockTypeKey(String var1, @Nonnull World var2, @Nonnull Vector3i var3, @Nonnull CustomTemplateConnectedBlockRuleSet var4, @Nonnull BlockType var5, int var6, @Nonnull Vector3i var7, boolean var8)

Known subclasses: CustomConnectedBlockPattern

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, PatternRotationDefinition, Rotation3D

Complete API:
  public abstract Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockTypeKey(String var1, World var2, Vector3i var3, CustomTemplateConnectedBlockRuleSet var4, BlockType var5, int var6, Vector3i var7, boolean var8)

Fields:
public static final CodecMapCodec<CustomTemplateConnectedBlockPattern> CODEC
