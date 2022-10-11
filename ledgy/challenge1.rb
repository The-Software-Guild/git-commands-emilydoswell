# Invested amounts (millions of euros) by Preferred Investors
$a_investment_amount = 0.9  
$b_investment_amount = 2.1
$c_investment_amount = 15

# Ownership distribution (%) by Preferred Investors
$a_percentage_distribution = 0.0667
$b_percentage_distribution = 0.1
$c_percentage_distribution = 0.5

# Sum of Investments (millions of euros) by Investors
$sum = $a_investment_amount + $b_investment_amount + $c_investment_amount

# 2x Cap amounts (in millions of euros)
$two_x_investor_a = $a_investment_amount * 2 
$two_x_investor_b = $b_investment_amount * 2
$two_x_investor_c = $c_investment_amount * 2

# Capitalization Table
$common = 1000000.00
$preferred_a = 200000.00
$preferred_b = 300000.00
$preferred_c = 1500000.00


# CHALLENGE ONE 

# Calculate shares distribution using ownership distribution
def challenge_one(euros)
  puts "Founders: €#{(euros * 0.3333).round}m"
  puts "Preferred A Investors: €#{(euros * $a_percentage_distribution).round}m" 
  puts "Preferred B Investors: €#{(euros * $b_percentage_distribution).round}m" 
  puts "Preferred C Investors: €#{(euros * $c_percentage_distribution).round}m" 
end

puts "Challenge 1"
puts challenge_one(60)

# CHALLENGE TWO

def challenge_two(euros)
  # subtract total initial investments from the exit distribution
  remainder = euros - $sum

  # Distrubute the remaining funds pro-rata
  puts "Founders: €#{remainder * 0.3333}m"
  puts "Preferred A Investors: €#{($a_investment_amount + remainder * $a_percentage_distribution).round(2)}m" 
  puts "Preferred B Investors: €#{($b_investment_amount + remainder * $b_percentage_distribution).round(2)}m" 
  puts "Preferred C Investors: €#{($c_investment_amount + remainder * $c_percentage_distribution).round(2)}m" 
end

puts "Challenge 2"
puts challenge_two(25)

# CHALLENGE THREE

def challenge_three(euros)
  # subtract total initial investments from the exit distribution
  remainder = euros - $sum

  # Calculate total shares
  shares = $common + $preferred_a + $preferred_b + $preferred_c
  
  # Calculate if A, B & C's percentage distribution > initial investment
  # If so, cap at 2x initial investment, remove their 2x initial investment from pool & remove their shares from capitialization table
  # Else, Calculate their shares from the remainder
  # PREFERRED A
  if $a_investment_amount + remainder * $a_percentage_distribution > $two_x_investor_a
    puts "Preferred A Investor: €#{$two_x_investor_a}"
    new_remainder = euros - $sum - $a_investment_amount
    shares -= $preferred_a
  else
    a = $preferred_a/shares
    puts "Preferred A Investors: €#{($a_investment_amount + new_remainder * a).round(2)}m" 
  end

  # PREFERRED B
  if $b_investment_amount + remainder * $b_percentage_distribution > $two_x_investor_b
    puts "Preferred B Investor: €#{$two_x_investor_b}"
    new_remainder = euros - $sum - $b_investment_amount
    shares -= $preferred_b
  else
    b = $preferred_b/shares
    puts "Preferred B Investors: €#{($b_investment_amount + new_remainder * b).round(2)}m" 
  end

  # PREFERRED C 
  if $c_investment_amount + remainder * $c_percentage_distribution > $two_x_investor_c
    puts "Preferred C Investor: €#{$two_x_investor_c}"
    new_remainder = euros - $sum - $c_investment_amount
    shares -= $preferred_c
  else
    c = $preferred_c/shares
    puts "Preferred C Investors: €#{($c_investment_amount + new_remainder * c).round(2)}m" 
  end
  
  # Calcuate founders share using the remainder
  f = $common/shares
  puts "Founders: €#{(new_remainder * f).round(2)}m"
end

puts "Challenge 3"
puts challenge_three(35)

# CHALLENGE FOUR

def challenge_four(euros)
  # subtract total initial investments from the exit distribution
  remainder = euros - $sum

  # Calculate total shares
  shares = $common + $preferred_a + $preferred_b + $preferred_c
  
  # PREFERRED C 
  if $c_investment_amount + remainder * $c_percentage_distribution > $two_x_investor_c
    puts "Preferred C Investor: €#{$two_x_investor_c}"
    new_remainder = euros - $two_x_investor_c
  else
    new_remainder = euros - $c_investment_amount
  end
  
  # PREFERRED B
  if $b_investment_amount + remainder * $b_percentage_distribution > $two_x_investor_b
    puts "Preferred B Investor: €#{$two_x_investor_b}"
    new_remainder -= $two_x_investor_b
    shares -= $preferred_b
  else
    new_remainder = euros - $b_investment_amount
  end

  # PREFERRED A
  if $a_investment_amount + remainder * $a_percentage_distribution > $two_x_investor_a
    if $preferred_a/shares * new_remainder > $two_x_investor_a
      puts "Preferred A Investor: €#{($preferred_a/shares * new_remainder).round(2)}"
    else
      puts "Preferred A Investor: €#{$two_x_investor_a}"
    end
  end

  puts "Founders: €#{(new_remainder * ($common/shares)).round(2)}m"
  puts "Preferred C Investors: €#{($c_investment_amount + new_remainder * ($preferred_c/shares)).round(2)}m" 

end

puts "Challenge 4"
puts challenge_four(45)


# CHALLENGE FOUR

def challenge_five(euros)
  # subtract total initial investments from the exit distribution
  remainder = euros - $sum

  # Calculate total shares
  shares = $common + $preferred_a + $preferred_b + $preferred_c
  
  # PREFERRED C 
  if $c_investment_amount + remainder * $c_percentage_distribution > $two_x_investor_c
    puts "Preferred C Investor: €#{$two_x_investor_c}"
    new_remainder = euros - $two_x_investor_c
  else
    new_remainder = euros - $c_investment_amount
  end
  
  # PREFERRED B
  if $b_investment_amount + remainder * $b_percentage_distribution > $two_x_investor_b
    puts "Preferred B Investor: €#{$two_x_investor_b}"
    new_remainder -= $two_x_investor_b
    shares -= $preferred_b
  else
    new_remainder = euros - $b_investment_amount
  end

  # PREFERRED A
  if $a_investment_amount + remainder * $a_percentage_distribution > $two_x_investor_a
    if $preferred_a/shares * new_remainder > $two_x_investor_a
      puts "Preferred A Investor: €#{($preferred_a/shares * new_remainder).round(2)}"
    else
      puts "Preferred A Investor: €#{$two_x_investor_a}"
    end
  end

  puts "Founders: €#{(new_remainder * ($common/shares)).round(2)}m"
  puts "Preferred C Investors: €#{($c_investment_amount + new_remainder * ($preferred_c/shares)).round(2)}m" 

end

puts "Challenge 5: 40 Euros"
puts challenge_five(40)

puts "Challenge 5: 50 Euros"
puts challenge_five(50)

puts "Challenge 5: 70 Euros"
puts challenge_five(70)
