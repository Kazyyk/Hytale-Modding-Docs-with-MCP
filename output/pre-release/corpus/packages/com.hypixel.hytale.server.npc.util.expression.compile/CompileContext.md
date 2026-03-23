# CompileContext

Type: class | Package: com.hypixel.hytale.server.npc.util.expression.compile

public class CompileContext

Compiles expression strings into executable instruction lists via the shunting-yard algorithm. Manages operand/operator stacks and scope.

Also in this package: CharacterSequenceMatcher, Lexer, LexerContext, OperatorBinary, OperatorUnary, ParsedToken, ParsedTokenConsumer, Parser, Token, TokenFlags

Complete API:
  public Scope getScope()
  public Stack<AST> getOperandStack()
  public ExecutionContext getExecutionContext()
  public ValueType compile(String expression, Scope compileScope, boolean fullResolve)
  public ValueType compile(String expression, Scope compileScope, boolean fullResolve, List<ExecutionContext.Instruction> instructions)
  protected ValueType compile0(String expression, Scope compileScope, boolean fullResolve, List<ExecutionContext.Instruction> instructions)
  public ValueType compile(String expression, boolean fullResolve)
  public List<ExecutionContext.Instruction> getInstructions()
  public void setInstructions(List<ExecutionContext.Instruction> instructionList)
  public ValueType getResultType()
  public ExecutionContext.Operand getAsOperand()
  public void checkResultType(ValueType type)
  public void pushOperand(Parser.ParsedToken parsedToken)
  public void processOperator(Parser.ParsedToken operator)
  public void processFunction(int argumentCount)
  public void processTuple(Parser.ParsedToken openingToken, int argumentCount)
  public void done()

Fields:
private final Parser parser
private final Stack<AST> operandStack
private final ExecutionContext executionContext
private Scope scope
private List<ExecutionContext.Instruction> instructions
private ValueType resultType
