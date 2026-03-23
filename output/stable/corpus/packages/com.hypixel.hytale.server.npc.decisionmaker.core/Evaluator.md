# Evaluator

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core

public class Evaluator

Core evaluator that scores and selects the best option from available NPC decision-making options.

Known subclasses: CombatActionEvaluator, StateEvaluator

Also in this package: ConditionReference, EvaluationContext, Option, OptionHolder

Complete API:
  public void initialise()
  public void setupNPC(Role role)
  public void setupNPC(Holder<EntityStore> holder)
  public Evaluator<OptionType>.OptionHolder evaluate(int index, ArchetypeChunk<EntityStore> archetypeChunk, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)

Fields:
public static final HytaleLogger LOGGER
public static long NOT_USED
protected List<Evaluator<OptionType>.OptionHolder> options
