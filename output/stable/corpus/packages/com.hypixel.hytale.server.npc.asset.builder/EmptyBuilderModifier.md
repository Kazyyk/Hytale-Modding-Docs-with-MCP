# EmptyBuilderModifier

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderModifier

public class EmptyBuilderModifier extends BuilderModifier

A singleton null-object implementation of BuilderModifier. Used when a `"Modify"` block is absent or empty. `isEmpty()` returns `true`, `exportedStateCount()` returns `0`, and `applyComponentStateMap`/`popComponentStateMap` throw `UnsupportedOperationException`.

## Fields

- INSTANCE | EmptyBuilderModifier | The singleton instance.

## Related Types

- BuilderModifier -- parent class
