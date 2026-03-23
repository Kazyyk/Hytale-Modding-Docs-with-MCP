# StateData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config | Extends: java.lang.Object

public class StateData

Maps between block state names and block type asset keys. Provides bidirectional lookups: state name to block key and block key to state name. The default state ID is `"default"`.

## Constants

- NULL_STATE_ID | "default"

## Methods


@Nullable
public String getBlockForState(String state)

Returns the block type key for the given state name, or `null` if no mapping exists.


@Nullable
public String getStateForBlock(String blockTypeKey)

Returns the state name for the given block type key, or `null` if no mapping exists.


@Nullable
public Map<String, Integer> toPacket(@Nonnull BlockType current)

Converts the state mapping to a packet-ready map of state names to asset indices.


public void copyFrom(@Nullable StateData state)

Copies state data from another instance if this instance has no mapping defined.

## Related Types

- BlockType -- uses this for block state variants
