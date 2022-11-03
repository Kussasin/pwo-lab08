package pwo.utils;

import java.math.BigDecimal;

/**
 *
 * @author Bohdan Basistyi
 */
public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();

    BigDecimal getTerm(int i);
}
