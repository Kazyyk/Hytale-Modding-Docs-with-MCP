# BuilderSensorBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.builders | Extends: BuilderBase<Sensor>

public abstract class BuilderSensorBase extends BuilderBase<Sensor>

## Fields

- protected boolean once
- protected final BooleanHolder enabled

## Methods

- @Nonnull @Override public Builder<Sensor> readCommonConfig(@Nonnull JsonElement data)
- @Nonnull @Override public Class<Sensor> category()
- public boolean getOnce()
- public void setOnce(boolean once)
- @Override public boolean isEnabled(ExecutionContext context)
- @Override public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
