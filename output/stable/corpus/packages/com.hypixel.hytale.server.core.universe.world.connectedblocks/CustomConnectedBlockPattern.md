# CustomConnectedBlockPattern

Type: class | Package: com.hypixel.hytale.server.core.universe.world.connectedblocks | Extends: CustomTemplateConnectedBlockPattern

public class CustomConnectedBlockPattern extends CustomTemplateConnectedBlockPattern

Custom implementation of a connected block pattern with user-defined face matching logic.

## Constants

- BuilderCodec<CustomConnectedBlockPattern> CODEC

## Key Methods

- public Optional<ConnectedBlocksUtil.ConnectedBlockResult> getConnectedBlockTypeKey(String shapeName, @Nonnull World world, @Nonnull Vector3i coordinate, @Nonnull CustomTemplateConnectedBlockRuleSet connectedBlockRuleset, @Nonnull BlockType blockType, int rotation, @Nonnull Vector3i placementNormal, boolean isPlacement)
