# InstructionRandomized

Type: class | Package: com.hypixel.hytale.server.npc.instructions | Extends: Instruction

public class InstructionRandomized extends Instruction

## Fields

- protected final IWeightedMap<InstructionRandomized.InstructionHolder> weightedInstructionMap
- protected final boolean resetOnStateChange
- protected final double minExecuteTime
- protected final double maxExecuteTime
- protected double timeout
- protected InstructionRandomized.InstructionHolder current
- protected static final InstructionRandomized.InstructionHolder[] EMPTY_ARRAY
- private final Instruction instruction

## Methods

- @Override public void execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- @Override public void clearOnce()
- @Override public void reset()

## Inner Types

- `InstructionRandomized.InstructionHolder`
