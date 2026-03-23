# PatternRotationDefinition

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class PatternRotationDefinition

Defines rotation variants for connected block patterns.

## Enum Constants

- `NONE`
- `X`
- `Z`

## Constants

- BuilderCodec<PatternRotationDefinition> CODEC

## Key Methods

- public Pair<Rotation, PatternRotationDefinition.MirrorAxis> get(int i)
- public int size()

Also in this package: AdjacentSide, ConnectedBlockFaceTags, ConnectedBlockPatternRule, ConnectedBlockResult, ConnectedBlockRuleSet, ConnectedBlockShape, ConnectedBlocksModule, ConnectedBlocksUtil, CustomConnectedBlockPattern, CustomConnectedBlockTemplateAsset, CustomTemplateConnectedBlockPattern, CustomTemplateConnectedBlockRuleSet, IncludeOrExclude, MirrorAxis, Rotation3D

Complete API:
  public List<Pair<Rotation,PatternRotationDefinition.MirrorAxis>> getRotations()

Fields:
public static final BuilderCodec<PatternRotationDefinition> CODEC
public static PatternRotationDefinition DEFAULT
private boolean isCardinallyRotatable
private boolean isMirrorZ
private boolean isMirrorX
public static final List<Pair<Rotation,PatternRotationDefinition.MirrorAxis>> ROTATIONS
