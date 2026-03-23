# DoubleHolderBase

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.holder | Extends: ValueHolder

public abstract class DoubleHolderBase extends ValueHolder

## Fields

- protected List<ObjDoubleConsumer<ExecutionContext>> relationValidators
- protected DoubleValidator doubleValidator

## Methods

- protected DoubleHolderBase()
- public void readJSON(@Nonnull JsonElement requiredJsonElement, DoubleValidator validator, String name, @Nonnull BuilderParameters builderParameters)
- public void readJSON( JsonElement optionalJsonElement, double defaultValue, DoubleValidator validator, String name, @Nonnull BuilderParameters builderParameters )
- public void addRelationValidator(ObjDoubleConsumer<ExecutionContext> validator)
- protected void validateRelations(ExecutionContext executionContext, double value)
- public double rawGet(ExecutionContext executionContext)
- public void validate(double value)
