# ConnectedBlockPatternRule

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks

public class ConnectedBlockPatternRule

Defines a single pattern matching rule for connected block faces.

## Enum Constants

- `Up`
- `Down`
- `North`
- `East`
- `South`
- `West`

## Constants

- BuilderCodec<ConnectedBlockPatternRule> CODEC

## Key Methods

- public Vector3i getRelativePosition()
- public HashSet<String> getBlockTypes()
- public Set<BlockPattern.BlockEntry> getShapeBlockTypeKeys()
- public ConnectedBlockFaceTags getFaceTags()
- public BlockTypeListAsset[] getBlockTypeListAssets()
- public ConnectedBlockPatternRule.AdjacentSide[] getPlacementNormals()
- public boolean isInclude()
