# StringHolderBase

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public abstract class StringHolderBase extends ValueHolder

## Fields

- protected List<BiConsumer<ExecutionContext, String>> relationValidators

## Methods

- protected StringHolderBase()
- public void addRelationValidator(BiConsumer<ExecutionContext, String> validator)
- protected void validateRelations(ExecutionContext executionContext, String value)
