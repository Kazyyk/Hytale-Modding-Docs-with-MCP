# CustomTemplateConnectedBlockRuleSet

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks | Extends: ConnectedBlockRuleSet

public class CustomTemplateConnectedBlockRuleSet extends ConnectedBlockRuleSet

Rule set that delegates to a CustomConnectedBlockTemplateAsset for connected block evaluation.

## Constants

- BuilderCodec<CustomTemplateConnectedBlockRuleSet> CODEC

## Key Methods

- public Map<String, BlockPattern> getShapeNameToBlockPatternMap()
- public void updateCachedBlockTypes(BlockType blockType, BlockTypeAssetMap<String, BlockType> assetMap)
- public Set<String> getShapesForBlockType(int blockTypeKey)
- public CustomConnectedBlockTemplateAsset getShapeTemplateAsset()
- public boolean onlyUpdateOnPlacement()
- public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockType(World world, Vector3i testedCoordinate, BlockType blockType, int rotation, Vector3i placementNormal, boolean isPlacement)
