# InterpretedCombatData

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.combat

public class InterpretedCombatData

Mutable data object holding interpreted combat state for a single active attack interaction. Tracks the attack ID, whether the entity is charging, elapsed time, and whether the attack is melee, ranged, or a block.

Also in this package: CombatData, CombatDataPool, CombatViewSystems, Ensure, EntityRemoved, Ticking

Complete API:
  public String getAttack()
  public void setAttack(String attack)
  public boolean isCharging()
  public void setCharging(boolean charging)
  public float getCurrentElapsedTime()
  public void setCurrentElapsedTime(float currentElapsedTime)
  public boolean isPerformingMeleeAttack()
  public void setPerformingMeleeAttack(boolean performingMeleeAttack)
  public boolean isPerformingRangedAttack()
  public void setPerformingRangedAttack(boolean performingRangedAttack)
  public boolean isPerformingBlock()
  public void setPerformingBlock(boolean performingBlock)
  public InterpretedCombatData clone()

Fields:
private String attack
private boolean charging
private float currentElapsedTime
private boolean performingMeleeAttack
private boolean performingRangedAttack
private boolean performingBlock
