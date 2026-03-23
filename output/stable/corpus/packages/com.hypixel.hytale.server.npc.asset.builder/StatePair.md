# StatePair

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class StatePair

An immutable tuple holding a full state name string and its resolved main state and sub-state integer indices. Used by BuilderModifier for exported state mappings and by BuilderSupport for mapped state pair resolution.

## Constructor


public StatePair(String fullStateName, int state, int subState)

## Methods

### getFullStateName


public String getFullStateName()

Returns the original state name string (e.g., `"idle.Default"`).

### getState


public int getState()

Returns the main state index.

### getSubState


public int getSubState()

Returns the sub-state index.

## Related Types

- BuilderModifier -- creates state pairs from `_ExportStates`
- BuilderSupport -- resolves mapped state pairs
- StateMappingHelper -- produces the indices
