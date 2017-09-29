puts "hello world"
puts "hi again"
puts "this is fun"
print "hi"
ary = [1, "two", 3.0] #=> [1, "two", 3.0]
puts ary
print ary
puts ary.at(0)
arr1 = Array.new(3) { Hash.new }

puts  arr1

 empty_table = Array.new(1) { Array.new(1) }

puts empty_table

arr2 = 5.times do |x|
  arNew = Array({:a => "a", :b => "b"})
print arNew
end

puts arr2

browsers = ['Chrome', 'Firefox', 'Safari', 'Opera', 'IE']
print browsers.length
print browsers
print browsers.empty?

puts arr5 = [1, 2, 3, 4, 5]
puts arr5.each { |a| print a -= 10, " " }
