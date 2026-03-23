# BuilderActionState

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.statemachine.builders | Extends: BuilderActionBase

public class BuilderActionState extends BuilderActionBase

NPC behavior tree builder for an action node. Configures execution logic.

## Fields

- state | String | String field.
- subState | String | String field.
- stateIndex | int | int field.
- subStateIndex | int | int field.
- clearState | boolean | boolean field.
- componentLocal | boolean | boolean field.

## Methods

- build(@Nonnull BuilderSupport builderSupport) | ActionState | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderActionState | public method.
- getStateIndex() | int | public method.
- getSubStateIndex() | int | public method.
- isClearState() | boolean | public method.
- isComponentLocal() | boolean | public method.
