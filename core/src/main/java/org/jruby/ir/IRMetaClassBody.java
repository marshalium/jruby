package org.jruby.ir;

import org.jruby.RubySymbol;
import org.jruby.parser.StaticScope;

public class IRMetaClassBody extends IRClassBody {
    public IRMetaClassBody(IRManager manager, IRScope lexicalParent, RubySymbol name, int lineNumber, StaticScope scope) {
        // FIXME: Eliminate obvious one-time use metaclass bodies if not too complicated
        super(manager, lexicalParent, name, lineNumber, scope, false);
    }

    @Override
    public IRScopeType getScopeType() {
        return IRScopeType.METACLASS_BODY;
    }

    @Override
    public boolean isNonSingletonClassBody() {
        return false;
    }
}
